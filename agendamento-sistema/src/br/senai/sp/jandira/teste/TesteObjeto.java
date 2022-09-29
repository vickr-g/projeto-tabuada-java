package br.senai.sp.jandira.teste;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;

public class TesteObjeto {

 public static void main(String[] args) {

	Especialidade e1 = new Especialidade("Cardiologia");
	//e1.setNome("Cardiologia");
	e1.setDescricao("Não deixa ter um ataque");

	Especialidade e2 = new Especialidade("Gastroenteologia");
	e2.setNome("Gastroenteologia");
	e2.setDescricao("Não deixa ficar com dor de barriga");

	Especialidade e4 = new Especialidade("Otorrino", "Cuida do ouvido");

	Especialidade e3 = new Especialidade();
	e3.setNome("Qualquer coisa!");

            // Exibir a quantidade de especialidades até agora
            System.out.println("TOTAL DE ESPECIALIDADES --->" + e1.getContador());


	ArrayList<Especialidade> especialidades = new ArrayList<>();
	especialidades.add(e1);
	especialidades.add(e2);
	especialidades.add(e3);
	System.out.println(especialidades.size());

	// Imprimir no console o nome das
	// especialidades que estão armazenada no arraylist

	int i = 0;
	while (i < especialidades.size()) {
		System.out.println(especialidades.get(i).getNome());
		i++;
	}

	// Utilização do for para iteração no arraylist
	// for (contador;condição;acumulador){

	//	}

	System.out.println("---------- FOR -------------");
	for (int x = 0; x < especialidades.size(); x++) {
		System.out.println(especialidades.get(x).getNome());
	}

	// FOR EACH -> para cada
	System.out.println("-------- FOR EACH ----------");
	for(Especialidade e : especialidades) {
		System.out.println(e.getNome());
	}

	// Criar 3 planos de saúde, armazenar em um arraylist
	// e exibir o nome da operadora de cada um deles
	// usando for each
	System.out.println("--------- FOR EACH PLANOS ---------");
	PlanoDeSaude p1 = new PlanoDeSaude("Amil");
	PlanoDeSaude p2 = new PlanoDeSaude("Bradesco");
	PlanoDeSaude p3 = new PlanoDeSaude("Notredame");

	ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
	planosDeSaude.add(p1);
	planosDeSaude.add(p2);
	planosDeSaude.add(p3);

	for (PlanoDeSaude p : planosDeSaude) {
		System.out.println(p.getOperadora());
		System.out.println(p.getQuantidade());
	}

	PlanoDeSaude xpto = new PlanoDeSaude();
	PlanoDeSaude xpto1 = new PlanoDeSaude();
	PlanoDeSaude xpto2 = new PlanoDeSaude();


	System.out.println("---------" + PlanoDeSaude.getQuantidade());

	AgendaApp.main(args);

	System.out.println("---------" + PlanoDeSaude.getQuantidade());
}
}