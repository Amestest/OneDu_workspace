let 정답 = {}; //빈 장바구니같은 배열

//옵션선택 기능만들기
function 옵션선택(선택한옵션) {
  // 각 질문에 대한 답을 저장
  let 현재질문 = Object.keys(정답).length + 1; //현재까지 사용자가 답한 질문의 수를 나타낸 것
  정답["문제" + 현재질문] = 선택한옵션; //정답이라는 배열에 내가 선택한 문제와 문제에 대한 옵션을 저장
  //  {'문제1' : 'E'}

  //다음질문 보여주기
  let 다음질문 = 현재질문 + 1;

  let 현재질문div = document.getElementById("문제" + 현재질문);
  let 다음질문div = document.getElementById("문제" + 다음질문);

  //만약에 다음질문으로 왔으면 현재질문은 숨기고 다음질문을 보여주겠다.
  if (다음질문div) {
    현재질문div.style.display = "none"; // 현재 질문 숨기기
    다음질문div.style.display = "block"; // 다음 질문 보여주기
  } else {
    결과확인하기();
  }
}

function 결과확인하기() {
let 결과확인 = "당신에게 맞는 원두 유형은 ";
let 결과이진수 = { A: 0, B: 0, C: 0, D: 0, E: 0, F: 0, G: 0, H: 0 };

for (let 문제 in 정답) {
  // 반복적인 작업을 수행하는 for 문
  // {'문제1' : 'E'}
  // console.log("문제 : " + 문제);
  // console.log("정답들 : " + 정답);
  결과이진수[정답[문제]]++;
  //console.log("결과이진수 : "+ [정답[문제]] +  결과이진수[정답[문제]]);
}

//결과 계산
if (결과이진수["A"] > 결과이진수["B"]) {
  결과확인 += "0";
} else {
  결과확인 += "1";
}

if (결과이진수["C"] > 결과이진수["D"]) {
  결과확인 += "0";
} else {
  결과확인 += "1";
}

if (결과이진수["E"] > 결과이진수["F"]) {
  결과확인 += "0";
} else {
  결과확인 += "1";
}

if (결과이진수["G"] > 결과이진수["H"]) {
  결과확인 += "0";
} else {
  결과확인 += "1";
}

document.getElementById("결과확인").innerText = 결과확인;
document.getElementById("결과확인").style.display = "block";
}

/*

추후에 이진수 값을 십진수로 변환해서 16개의 원두 중 하나로 매치할 예정


*/

/*
function 이전버튼() {
  let 현재질문 = Object.keys(정답).length + 1;

  let 이전질문 = 현재질문 - 1;

  let 현재질문div = document.getElementById("문제" + 현재질문);
  let 이전질문div = document.getElementById("문제" + 이전질문);

    if (이전질문div) {
      현재질문div.style.display = "none"; // 현재 질문 숨기기
      이전질문div.style.display = "block"; // 이전 질문 보여주기
    }
}

function 다음버튼() {
  let 현재질문 = Object.keys(정답).length + 1;

  let 다음질문 = 현재질문 + 1;

  let 현재질문div = document.getElementById("문제" + 현재질문);
  let 다음질문div = document.getElementById("문제" + 다음질문);

  if (다음질문div) {
    현재질문div.style.display = "none"; // 현재 질문 숨기기
    다음질문div.style.display = "block"; // 다음 질문 보여주기
  }
}
*/