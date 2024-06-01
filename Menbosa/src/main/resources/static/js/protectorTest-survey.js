let $buttons = $(".protectorTest-suvey-testContents-answer");
let $case = $(".protectorTest-suvey-testContents-answerbuttons");
let totalScore = 1;

$buttons.each((index,button) => {
    $(button).on('click', function() {
        $(this).toggleClass("active");

        console.log(totalScore);
    });
});

$buttons.each((index,buttonValue) => {
    totalScore = 1;
    console.log($(buttonValue).data("value"));
    totalScore += $(buttonValue).data("value");
    console.log(totalScore);
});