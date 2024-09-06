import java.util.Arrays;

import domain.Disciplina;
public class App {
    public static void main(String[] args) throws Exception {
       Disciplina logicaProgramacao = new Disciplina(1,"Lógica de Programação",66,"if,Else","livro legal");

       Disciplina programacaoNivelGod = new Disciplina(1, "Programação Nível God", 66, "Se prepara", "Bíblia sagrada dos devs");

       programacaoNivelGod.setPreRequisitos(Arrays.asList(logicaProgramacao));
    }

}
