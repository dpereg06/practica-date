public class Date{

	private int dia;
	private int mes;
	private int anio;

	public Date(){

		dia = 0;
		mes = 0;
		anio = 0;
	}

	public Date(int dia,int mes,int anio) throws Exception {
		StringBuffer message = new StringBuffer();

		if (comprobacionDia() == false)
			message.append("El día introducido es erróneo\n ");
		if (comprobacionMes() == false)
			message.append("El mes introducido es erróneo\n");
	}

	public void setDia(int dia){
			
		this.dia = dia;
	}

	public void setMes(int mes){

		this.mes = mes;
	}

	public void setAño(int anio){

		this.anio = anio;
	}

	public int getDia(){

		return dia;
	}

	public int getMes(){

		return mes;
	}

	public int getAnio(){
	
		return anio;
	}

	public boolean isSameYear(int anio){
		boolean sameYear = false;
		
		if (this.anio == anio)
			sameYear = true;

		return sameYear;
	}

	public boolean isSameMonth(int mes){
		boolean sameMonth = false;
		
		if (this.mes == mes)
			sameMonth = true;

		return sameMonth;
	}

	public boolean isSameDay(int dia){
		boolean sameDay = false;
		
		if (this.dia == dia)
			sameDay = true;

		return sameDay;
	}

	public String nombreMes(){
		StringBuffer salida = new StringBuffer();

		switch(mes){
			case 1:
			salida.append("Enero");
			break;
			case 2:
			salida.append("Febrero");
			break;
			case 3:
			salida.append("Marzo");
			break;
			case 4:
			salida.append("Abril");
			break;
			case 5:
			salida.append("Mayo");
			break;
			case 6:
			salida.append("Junio");
			break;
			case 7:
			salida.append("Julio");
			break;
			case 8:
			salida.append("Agosto");
			break;
			case 9:
			salida.append("Septiembre");
			break;
			case 10:
			salida.append("Octubre");
			break;
			case 11:
			salida.append("Noviembre");
			break;
			case 12:
			salida.append("Diciembre");
			break;
		}

		return salida.toString();
	}

	public String estacionAnio(){

		StringBuffer salida = new StringBuffer();

		switch(mes){
			case 1:
			case 2:
			case 3:
			salida.append("Invierno");
			break;
			case 4:
			case 5:
			case 6:
			salida.append("Primavera");
			break;
			case 7:
			case 8:
			case 9:
			salida.append("Verano");
			break;
			case 10:
			case 11:
			case 12:
			salida.append("Invierno");
			break;

		}

		return salida.toString();
	}

	public String mesesRestantes(){

		int i;
		StringBuffer salida = new StringBuffer();

		for(i=mes;i <= 12;i++){
			salida.append(nombreMes() + "\n");
		}

		return salida.toString();
	}

	public String diasRestantes(){

		int i;
		StringBuffer salida = new StringBuffer();

		for(i=dia;i <= 31;i++){
			salida.append(dia + " ");
		}

		return salida.toString();
	}

	public String mismosDiasMes(){

		StringBuffer salida = new StringBuffer();

		switch (mes){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			salida.append("Enero Marzo Mayo Julio Agosto Octubre Diciembre");
			break;

			case 2:
			salida.append("Febrero");
			break;

			case 4:
			case 6:
			case 9:
			case 11:
			salida.append("Abril Junio Septiembre Noviembre");
			break;
		}

		return salida.toString();
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

	public String toString(){
		StringBuffer salida = new StringBuffer();

		salida.append("Día: " + this.dia + "\nMes: " + this.mes + "\nAño: "+ this.anio);

		return salida.toString();
	}
}





