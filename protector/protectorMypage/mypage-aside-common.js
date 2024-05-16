//탈퇴하기
let $asidesecession = $("#mypage-asidesecession");
let asidesecession_value = false;
$asidesecession.on('click',()=>{
  asidesecession_value = confirm("탈퇴하시겠습니까?")
});