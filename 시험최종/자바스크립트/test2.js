
function setAvgAge(){	
  const ageTds = document.querySelectorAll('.ageTd');

  let sum = 0;

  for(const tdTag of ageTds){
   const result = Number(tdTag.textContent);
   sum = sum + result;
  }

  const avg = sum / ageTds.length;

  const resultTd = document.querySelector('#resultTd');
  resultTd.textContent = avg;

  
    


}