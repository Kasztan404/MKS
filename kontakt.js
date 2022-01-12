	var t="tonmai";
	var wynik=0;
function pokazMail() {
	var paragraf = document.createElement("p");  
	var textparagraf = document.createTextNode("Mój mejl to: "+"m.pes"+t[0]+"ka"+"@pro"+t+"l"+".com");
	paragraf.appendChild(textparagraf);    
	document.getElementsByClassName('tresc2')[0].appendChild(paragraf);
}
function input() {
	var odpowiedz = document.getElementById("rozwiazanie").value;
	liczba = parseInt(odpowiedz);
	if (wynik==0){
		if (odpowiedz =="" || odpowiedz==" ") {
			alert("Hola! Brak odpowiedzi!");
			document.getElementById("rozwiazanie").value="";
		}
		else if (isNaN(liczba)) {
			alert("Wprowadź jakąś liczbę!");
			document.getElementById("rozwiazanie").value="";
		}	
		else {
			if ( liczba==2*(5%4+7%4)-5)
			{
				alert ("TAK!");
				pokazMail();
				wynik=1;
			}
			else {
				alert ("To nie ta liczba!");
				document.getElementById("rozwiazanie").value="";
			}
		
		}
	}
}