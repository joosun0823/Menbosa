package com.example.menbosa.controller.sms;

import net.nurigo.sdk.NurigoApp;
import net.nurigo.sdk.message.model.Message;
import net.nurigo.sdk.message.request.SingleMessageSendingRequest;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;
import net.nurigo.sdk.message.service.DefaultMessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
public class SmsController {

    final DefaultMessageService messageService;

    public SmsController() {
        // 반드시 계정 내 등록된 유효한 API 키, API Secret Key를 입력해주셔야 합니다!
        this.messageService = NurigoApp.INSTANCE.initialize("NCSPOHDCMRBTVPM6", "E8CC6OBRIR12YC1NVQGMHPQWBUC5PRT5", "https://api.coolsms.co.kr");
    }

    @GetMapping("/send-one")
    public SingleMessageSentResponse sendOne(){
        //pro인지 sen인지 구분하여 쿼리 사용
        String phoneNum = null;
        int division = 2;
        switch (division){
            case 1:

                break;

            case 2:
                System.out.println("쿼리이이이이이이이이이이");
                break;
        }


        //난수 생성 후 컬럼에 저장
        int smsMessage = randomNumberCreate();


        //메세지 전송 값 입력 후 전송
        Message message = new Message();
        // 발신번호 및 수신번호는 반드시 01012345678 형태로 입력되어야 합니다.
        message.setFrom("01026573508");
        message.setTo(phoneNum);
//        message.setText("한글 45자, 영자 90자 이하 입력되면 자동으로 SMS타입의 메시지가 추가됩니다.");
        message.setText("알흠 ["+smsMessage+"] 인증번호를 입력해주세요");

        SingleMessageSentResponse response = this.messageService.sendOne(new SingleMessageSendingRequest(message));
        System.out.println(response);

        return null;
    }

//    @PostMapping("/send-one")
//    public SingleMessageSentResponse sendOneTest() {
//        Message message = new Message();
//        message.setFrom("01026573508");
//        message.setTo("01023863707");
//        message.setText("test message");
//
//        SingleMessageSentResponse response = this.messageService.sendOne(new SingleMessageSendingRequest(message));
//        System.out.println(response);
//
//        return response;
//    }

    //난수 생성
    private int randomNumberCreate(){
        int min = 10000;
        int max = 99999;
        return (int)Math.floor(Math.random() * (max - min + 1)) + min;
    }
}
