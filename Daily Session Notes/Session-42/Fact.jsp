<%! int fact(int n)
{
	int f = 1;
	for(int i=n;i>=1;i--)
		f = f * i;
	return f;
}
%>
<h1>Factorial : <%= fact(5) %> </h1>