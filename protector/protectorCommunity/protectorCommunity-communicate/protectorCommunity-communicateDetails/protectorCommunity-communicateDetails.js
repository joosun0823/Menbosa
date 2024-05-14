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

