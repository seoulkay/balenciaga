//배열 array
var list = ["아이팟", "홍성", "김해원", "이일환", "kay", "김비오"];
var list2 = ["아이팟", "홍성", "김해원", "이일환", "kay", "김비오"];

function sukjae2(p1){
	//액션

	//수도코드 psedu code
	//숫자를 0에서 부터 4까지 OK -> 근데 사실 배열의 개수를 얻어야 된다.
	//그숫자로 콘솔로그를 찍는다
	//4가 되면 멈춘다. OK -> 근데 사실 배열의 개수에 끝에서 끝나야 된다.
	//for (var i = 2; i < 10; i++) {}

	for(var i = 0; i < p1.length ; i++){
		console.log(p1[i]);
	}
}

sukjae2(list);
