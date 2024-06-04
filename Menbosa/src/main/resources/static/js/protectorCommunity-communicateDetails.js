const titleTabMenu = document.querySelector(".menuButton");
const titleSubTabMenu = document.querySelector(".menuButton-modifyDelete");
const commentMenu = document.querySelectorAll(".comments-menuButton");
const commentSubMenu = document.querySelectorAll(".comments-list-submenu")
const replyButton = document.querySelectorAll(".reply");
const replyInputBox = document.querySelectorAll(".reply-inputBox");


titleTabMenu.addEventListener("click", function() {
  titleSubTabMenu.classList.toggle("active");
})

titleSubTabMenu.addEventListener("mouseleave", function() {
  titleSubTabMenu.classList.remove("active");
})


for(let i = 0; i < commentMenu.length; i ++)  {
  commentMenu[i].addEventListener("click", function() {
    commentSubMenu[i].classList.toggle("active");
  })

  commentSubMenu[i].addEventListener("mouseleave", function() {
    commentSubMenu[i].classList.remove("active");

  })

}


// replyButton.addEventListener("click", function() {
//   replyInputBox.classList.toggle("reply-active");
// })


replyButton.forEach((e,i) => {
  e.addEventListener("click", () => {
    replyInputBox[i].classList.toggle("reply-active");

    replyButton.forEach((e,j) => {
      if(j !== i) {
        replyInputBox[j].classList.remove("reply-active");
      }
    })
  })
})

const commentDelete = document.querySelectorAll(".comments-list-submenu > li:nth-of-type(2)");
commentDelete.forEach((e,i) => {
  e.addEventListener("click", ()=>{
    confirm("삭제하시겠습니까?")
  })
})


let $modifyBtn = document.querySelector('.modifyButtn');

$modifyBtn?.addEventListener("click", function () {
  let boardCommuNum = this.dataset.id;
  console.log(boardCommuNum)
  location.href = `/alheum/community/commuModify?boardCommuNum=${boardCommuNum}`;
});

let $removeBtn = document.querySelector('.deleteButtn');

$removeBtn?.addEventListener("click", function (){
  let boardCommuNum = this.dataset.id;
  if(confirm("삭제하시겠습니까?")){
    location.href = `/alheum/community/commuRemove?boardCommuNum=${boardCommuNum}`;
  }
})



//이미지 상세 불러오기
let boardCommuNum = document.querySelector('#boardCommuNum').value;

imgAjax();


function imgAjax(){
  fetch(`/v1/commu/${boardCommuNum}/files`, {method: 'GET'})
      //서버에 GET요청을 보내 파일 목록을 가져옴
      .then(res => res.json())//응답을 JSON으로 변환
      .then(list => { //변환된 데이터를 list 변수에 저장
        console.log(list)

        let tags = ''; //HTML 태그를 저장할 변수 초기화

        for (let i = 0; i < list.length; i++) {
          let fileName = list[i].fileExt + '/' + list[i].fileServer + '_' + list[i].fileUser;
          //파일 경로 조합

          tags += `
                         <img src="/v1/files?fileName=${fileName}" data-id="${list[i].fileNum}" data-name="${fileName}"/>
                        `;
        }

        let $postImgs = document.querySelector('.post-images'); //이미지가 삽입될 요소

        $postImgs.innerHTML = tags; //생성된 html 태그를 삽입
      });

}



////////////////////////////////////////////////////////////////////////////


