package com.lipe.teste.collections;

import java.util.Objects;
import java.util.function.Predicate;

public class Aula implements Predicate<Aula> {

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }
    
    public static boolean testandopredicate(Aula t) {
    	return t.tempo > 20;
    }
    
    public boolean testandopredicate2() {
    	return this.tempo > 15;
    }
    
    @Override
    public String toString(){
		return this.titulo + "==="+this.tempo ;
    	
    }

	@Override
	public boolean test(Aula t) {
		return t.tempo > 20;
	}

	@Override
	public int hashCode() {
		return Objects.hash(tempo, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		return tempo == other.tempo && Objects.equals(titulo, other.titulo);
	}
	
	

//	@Override
//	public int compareTo(Aula outraAula) {
//		 return this.titulo.compareTo(outraAula.titulo);
//	}
}