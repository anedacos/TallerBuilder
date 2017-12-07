package main;

import Builder.BuilderAsusROGE;
import Builder.ComputadorDirector;
import emsamablajecomputadoras.creacional.Computador;

public class Main {

	public static void main(String[] args) {
		ComputadorDirector creador = new ComputadorDirector(new BuilderAsusROGE());
		Computador comp = creador.getComputador();
		String especificacion = comp.especificacionesTecnicas();
		System.out.println(especificacion);
	}

}
