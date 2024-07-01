// const let 중에서 변수처럼 안에 있는 값이 변경 가능한 let 사용
let answer = {}; //빈 장바구니같은 배열

//옵션선택 기능만들기
function chooseOption(presentQuestion) {
  // 각 질문에 대한 답을 저장
  let presentQuestion = Object.keys(answer).length + 1; //현재까지 사용자가 답한 질문의 수를 나타낸 것
  answer["question" + presentQuestion] = chooseOption; //정답이라는 배열에 내가 선택한 문제와 문제에 대한 옵션을 저장
  //  {'문제1' : 'E'}

  //다음질문 보여주기
  let nextQuestion = presentQuestion + 1;

  let presentQuestionDiv = document.getElementById("question" + presentQuestion);
  let nextQuestionDiv = document.getElementById("question" + nextQuestion);

  //만약에 다음질문으로 왔으면 현재질문은 숨기고 다음질문을 보여주겠다.
  if (nextQuestionDiv) {
    presentQuestionDiv.style.display = "none"; // 현재 질문 숨기기
    nextQuestionDiv.style.display = "block"; // 다음 질문 보여주기
  } else {
    seeResult();
  }
}

/*                                                             

MBTI 는 결과확인(let)에 한 글자씩 추가해서 출력하는 것이고
커피취향테스트는 switch로 하는게 맞는것 같음

*/

function seeResult() {
  let result = "당신의 성격 유형은 ";
  let MBTI갯수확인 = { E: 0, I: 0, S: 0, N: 0, T: 0, F: 0, J: 0, P: 0 };

  // 문제에 대해 체크한 답을 더해줄 것
  /*
 
  첫번째 반복
  문제 = 문제 1
  정답[문제] = 정답[문제1] = E 인지  정답[문제1] = I
 let MBTI갯수확인 = { 'E':1, 'I':0, 'S':0, 'N':0, 'T':0, 'F':0, 'J':0, 'P':0        };
     
 문제 = 문제 2
 정답[문제] = 정답[문제2] = S 인지  정답[문제2] = N
 let MBTI갯수확인 = { 'E':1, 'I':0, 'S':0, 'N':1, 'T':0, 'F':0, 'J':0, 'P':0        };

 문제 = 문제 3
 정답[문제] = 정답[문제3] = T 인지  정답[문제3] = F
 let MBTI갯수확인 = { 'E':1, 'I':0, 'S':0, 'N':1, 'T':1, 'F':0, 'J':0, 'P':0        };

 문제 = 문제 4
 정답[문제] = 정답[문제4] = J 인지  정답[문제4] = P
 let MBTI갯수확인 = { 'E':1, 'I':0, 'S':0, 'N':1, 'T':1, 'F':0, 'J':0, 'P':1        };
 */
  for (let question in answer) {
    // 반복적인 작업을 수행하는 for 문
    // {'문제1' : 'E'}
    // console.log("문제 : " + 문제);
    // console.log("정답들 : " + 정답);
    MBTI갯수확인[Answer[question]]++;
    //console.log("MBTI갯수확인 : "+ [정답[문제]] +  MBTI갯수확인[정답[문제]]);
  }

  //MBTI 결과 계산

  //만약에 E와 I가 있는데 E가 I보다 많다면

  if (MBTI갯수확인["E"] > MBTI갯수확인["I"]) {
    result += "E";
  } else {
    result += "I";
  }

  //만약에 S와 N이 있는데 S가 N보다 많다면
  if (MBTI갯수확인["S"] > MBTI갯수확인["N"]) {
    result += "S";
  } else {
    result += "N";
  }

  //만약에 T와 F가 있는데 T가 F보다 많다면
  if (MBTI갯수확인["T"] > MBTI갯수확인["F"]) {
    result += "T";
  } else {
    result += "F";
  }

  //만약에 J와 P가 있는데 J가 P보다 많다면
  if (MBTI갯수확인["J"] > MBTI갯수확인["P"]) {
    result += "J";
  } else {
    result += "P";
  }

  document.getElementById("result").innerText = result;
  document.getElementById("result").style.display = "block";
}
