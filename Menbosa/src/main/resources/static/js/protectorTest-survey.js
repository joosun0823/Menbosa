let $buttons = $(".protectorTest-suvey-testContents-answer");
let $case = $(".protectorTest-suvey-testContents-answerbuttons");
let $result = $(".suvey-button");
let totalScore = 0;

//클릭하면 클래스 추가
$buttons.each((index, button) => {
    $(button).on('click', function () {
        $(this).toggleClass("active");
    });
});

//점수연산
$result.on('click', () => {
    totalScore = 1; //검사 안한 사람들과 구분하기 위한 점수
    $buttons.each((index, buttonValue) => {
        if($(buttonValue).attr('class') === "protectorTest-suvey-testContents-answer active") {
            totalScore += $(buttonValue).data("value");
        }
    });
    console.log(totalScore);
});
