package br.senai.sp.jandira.model;


	import java.time.LocalDate;
	import java.time.LocalTime;

	public class Agenda {

		private LocalDate data;
		private LocalTime time;
		private Paciente paciente;
		private Medico medico;
		private Especialidade especialidade;
		public LocalDate getData() {
			return data;
		}
		public void setData(LocalDate data) {
			this.data = data;
		}
		public LocalTime getTime() {
			return time;
		}
		public void setTime(LocalTime time) {
			this.time = time;
		}
		public Paciente getPaciente() {
			return paciente;
		}
		public void setPaciente(Paciente paciente) {
			this.paciente = paciente;
		}
		public Medico getMedico() {
			return medico;
		}
		public void setMedico(Medico medico) {
			this.medico = medico;
		}
		public Especialidade getEspecialidade() {
			return especialidade;
		}
		public void setEspecialidade(Especialidade especialidade) {
			this.especialidade = especialidade;
		}
		
		

	}



