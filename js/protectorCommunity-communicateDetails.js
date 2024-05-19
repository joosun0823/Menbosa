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


const detailDelete = document.querySelector(".menuButton-modifyDelete > li:nth-of-type(2)");
detailDelete.addEventListener("click", function(){
  confirm("삭제하시겠습니까?")
})

const commentDelete = document.querySelectorAll(".comments-list-submenu > li:nth-of-type(2)");
commentDelete.forEach((e,i) => {
  e.addEventListener("click", ()=>{
    confirm("삭제하시겠습니까?")
  })
})