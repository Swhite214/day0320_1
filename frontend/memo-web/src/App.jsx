import { useState } from "react";

function App() {
  const [content, setContent] = useState("");
  const [writer, setWriter] = useState("");
  
  const fetchApi=(data)=>{ //then then에는 await가 포함되어있는것
    fetch("http://localhost:8080/memo",{
      method: "POST", //보내는방식
      body: JSON.stringify(data), //문자열로 직열화=stringify 자바의 직렬화 객체는 보내려면 순서를 정해줘야함 그게 직렬화
      headers:{
        "Content-Type": "application/json" //헤더에는 원본파일이 직렬화 하기전에 어떤타입이였는지표시
      },
    })
    .then(()=>{})
    .then(()=>{})
    .catch((error)=>console.log("Error : " , error))
  }

  const handleSubmit=(event)=>{
    event.preventDefault(); //a,form태그에 보통 적용합니다 해당기능을 막아주는 역할을합니다 예를들어 submit버튼을 누르면 submit이 동작하지않습니다
    // alert("등록"); 즉 버튼누르면 js이동해서 서버로 데이터 전송
    // alert(content + "," + writer)
    // 서버에 보낼 데이터
    //name : 변수(value)의형태가 바로 객체
    const data={
      content : content,
      writer : writer
    }
    fetchApi(data);
  }

  

  return (
    <>
     <h1>메모등록</h1>
     <form id="memo-form" onSubmit={handleSubmit}> 
      <p>
        <input type="text" placeholder="메모를 등록해주세요" 
        value={content} onChange={(event)=>{setContent(event.target.value)}}     />
      </p>
      <p>
        <input type="text" value={writer} onChange={(event)=>{setWriter(event.target.value)}}  placeholder="이름" />
      </p>
      <p>
        <button type="submit">등록</button>
      </p>
     </form>
    </>
  )
}

export default App
