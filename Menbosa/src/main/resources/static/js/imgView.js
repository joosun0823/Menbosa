let boardId = document.querySelector('#boardId').value;

displayImgAjax(); //이미지 표시 함수 호출


//Ajax : Asynchronous JavaScript and XML
// JS와 XML을 활용하여 비동기 통신으로 데이터를 교환하는 기법
// Ajax라는 기술을 활용하는 방법은 여러가지가 있지만 우리는 fetchAPI를 사용한다.
function displayImgAjax() {
    // fetch()함수는 js에 내장된 함수이므로 바로 사용하면된다.
    /*

    fetch('api주소', {설정객체})
        .then(함수)       // api에서 보낸 응답을 then으로 받는다.
        .then(함수);      // 위의 then에서 반환하는 값을 여기서 받는다.

     */
    // fetch(`/v1/boards/${boardId}/files`, {method : 'GET'})
    //     .then(res => res.json()) // 응답을 받아서 데이터를 변환하고 다음 then으로 넘겨준다.
    //     .then(data => console.log(data))  // 위에서 넘겨준 데이터를 올바르게 처리한다.


    fetch(`/v1/posts/${boardRecomNum}/imgFiles`, {method: 'GET'})
        //서버에 GET요청을 보내 파일 목록을 가져옴
        .then(res => res.json())//응답을 JSON으로 변환
        .then(list => { //변환된 데이터를 list 변수에 저장
            let tags = ''; //HTML 태그를 저장할 변수 초기화

            for (let i = 0; i < list.length; i++) {
                let fileName = list[i].imgFileExt + '/' + list[i].imgFileServer + '_' + list[i].imgFileUser;
                //파일 경로 조합

                tags += `<a href="/download?fileName=${fileName}">
                         <img src="/v1/files?fileName=${fileName}" data-id="${list[i].imgFileNum}" data-name="${fileName}"/>
                        </a>`;
            }

            let $postImgs = document.querySelector('.post-images'); //이미지가 삽입될 요소

            $postImgs.innerHTML = tags; //생성된 html 태그를 삽입
        });
}
















