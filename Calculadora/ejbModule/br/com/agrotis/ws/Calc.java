package br.com.agrotis.ws;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import br.com.agrotis.calc.SomarEnvio;
import br.com.agrotis.calc.SomarRetorno;

/**
 * Session Bean implementation class Calc
 */
@Stateless
@WebService(name = "CalcRemote",
		  	targetNamespace = "http://www.agrotis.com.br/Calc/",
		  	serviceName = "Calc",
		  	portName = "Calc",
		  	wsdlLocation = "META-INF/wsdl/Calc.wsdl")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.BARE)
public class Calc implements CalcRemote {

	@Override
	public SomarRetorno somar(SomarEnvio envio) {
		SomarRetorno retorno = new SomarRetorno();
		retorno.setResultado(envio.getValor1()+envio.getValor2());
		return retorno;
	}



}
