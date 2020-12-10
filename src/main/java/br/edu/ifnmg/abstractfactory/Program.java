/*
 * The MIT License (MIT)
 * Copyright (c) [2020] [Reinaldo Junio Dias de Abreu]
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
*/

package br.edu.ifnmg.abstractfactory;

/**
 *
 * @author Reinaldo Junio Dias de Abreu
 * @version 1.0
 * 
 * Classe para teste/acesso das Abstract Factory do Aluguel de carros.
 * 
 */
public class Program {
    
    private static Aluguel criarAluguel(String tipoPessoa){
        // Usar a fábrica para retornar o objeto de aluguel correto para o tipo pessoa.
        
        FactoryAluguel fa = null;
        
        if(tipoPessoa.equals("fisica")){
            fa = new FactoryAluguelPopular();
        } 
        
        if(tipoPessoa.equals("juridica")){
            fa = new FactoryAluguelLuxo();
        }

        // Uso o padão do objeto definido na fábrica para criar o meu produto na especificação correta.
        Aluguel aluguel = new Aluguel();
        aluguel.setCliente(fa.selecionarCliente());
        aluguel.setCarro(fa.selecionarCarro());
        
        return aluguel;
    }
    
    public static void main(String[] args) {
        Aluguel aluguelPop = criarAluguel("fisica");
        Aluguel aluguelLux = criarAluguel("juridica");
        
        System.out.println("---------- Aluguel Pessoa Física ----------");
        System.out.println(aluguelPop);
        System.out.println("---------- Aluguel Pessoa Jurídica ----------");
        System.out.println(aluguelLux);
    }
}
