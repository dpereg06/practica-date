public class Date{

	private int dia;
	private int mes;
	private int año;

	public Date(){

		dia = 0;
		mes = 0;
		año = 0;
	}

	public void setDia(int valorDia){

		dia = valorDia;
		comprobacionDia();
	}

	public void setMes(int valorMes){

		mes = valorMes;
		comprobacionMes();
	}

	public void setAño(int valorAño){

		año = valorAño;
	}

	public int getDia(){

		return dia;
	}

	public int getMes(){

		return mes;
	}

	public int getAño(){
	
		return año;
	}

	public boolean comprobacionDia(){

		boolean cDia = true;

		switch (mes){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			if (dia < 1 || dia > 31){
				cDia = false;
			}
			break;

			case 2:
			if (dia < 1 || dia > 28){
				cDia = false;
			}
			break;

			case 4:
			case 6:
			case 9:
			case 11:
			if (dia < 1 || dia > 31){
				cDia = false;
			}
			break;
		}
	
		return cDia;
	}

	public boolean comprobacionMes(){

		boolean cMes = true;

		if (mes < 1 && mes > 12){
			cMes = false;
		}

		return cMes;
	}
}

		







