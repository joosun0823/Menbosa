let $certiMessage = $("#certiMessage");
let $mid = $("#phoneNum-second").val();
let $back = $("#phoneNum-last").val();

let division = 2;
//proMem = 1, senMem = 2

$certiMessage.on("click", function () {
    if($mid.length === 4 || $back.length === 4) {
        let phoneNum = "010"+$mid+$back;
        location.href = `/sms/send-one?phoneNum=${phoneNum}&division=${division}`;
    }else{
        alert("휴대폰 번호를 제대로 입력해주세요.")
    }
});