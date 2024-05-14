const titleTabMenu = document.querySelector(".menuButton");
const titleSubTabMenu = document.querySelector(".menuButton-modifyDelete");
const commentMenu = document.querySelectorAll(".comments-menuButton");
const commentSubMenu = document.querySelectorAll(".comments-list-submenu")

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


// const commentBar = document.querySelector(".protectorCommunity-communicateDetails-commentsInput");
// const footer = document.querySelector("footer");

// window.addEventListener("scroll", function() {
//   let location = this.window.pageYOffset;
//   console.log(location);


//   // if(location < this.document.) {
//   //   commentBar.style.position = "fixed";
//   // } else{
//   //   commentBar.style.position = "relative";
//   // }

//   if(location < footer.getBoundingClientRect().y){
//     commentBar.style.position = "fixed";
//     commentBar.style.bottom = "200px";
    
//   } else{

//     commentBar.style.position = "relative";
//   }

// })




// console.log(footer.getBoundingClientRect().y);
// console.log(document.body.clientHeight);