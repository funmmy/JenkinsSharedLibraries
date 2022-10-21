def call(String msg){
  if ("${msg}" == "review")
	{
	input {
        message 'please review this code'
  	ok 'yes'
	}
}
  else 
  	{echo "you have done the wrong thing"}
}  		

