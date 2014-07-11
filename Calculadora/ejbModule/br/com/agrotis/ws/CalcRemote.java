package br.com.agrotis.ws;

import javax.ejb.Remote;

import br.com.agrotis.calc.SomarEnvio;
import br.com.agrotis.calc.SomarRetorno;

@Remote
public interface CalcRemote {

	public SomarRetorno somar(SomarEnvio envio);

}
