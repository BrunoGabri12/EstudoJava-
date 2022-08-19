package cap10.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthToolTipUI;

import cap10.exer1.foreach;
public class list {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(); 
        // list é uma interface 
        //Ao utilizar o list, o ArrayList implementa apenas os métodos da interface 
        //list. A classe List é mais generica, portanto mais facilmente modificavel para outros tipos de list
        //Todavia, o ArrayList possui mais métodos pertencentes somente a classe ArrayList
        

        list.add(10);
        list.add(4);
        list.add(15);

        
        list.add(100);
        list.add(40);
        list.add(150);

        list.add(1, 12333);


        list.removeIf(x -> x % 2 != 0); 

        for (Integer integer : list) {
            System.out.println(integer);
        }
System.out.println("-------------");
        
        List<Integer> listWith = list.stream().filter(x -> x % 100 == 0).collect(Collectors.toList());

        for (Integer integer : listWith) {
            System.out.println(integer);
        }

        System.out.println("-=--------------------");
        Integer intelment = list.stream().filter(x -> x % 2 == 0).findFirst().orElse(-1);

        System.out.println(intelment);
    }




}
