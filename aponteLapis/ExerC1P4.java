//Exercícios do Livro: Use a cabeça! Java

//Enunciado
//Tente adivinhar o que cada linha de código está fazendo...

int size = 27; //declara uma variável do tipo inteira chamada size e lhe atribui o valor 27.

String name = "Fido"; //declara uma variável do tipo string chamada name e lhe atribui o texto Fido.

Dog myDog = new Dog(name, size); //declara a nova variável de tipo Dog chmada 'myDog' e cria o novo objeto Dog usando 'name' e "size".

x = size - 5; //efetua uma subtração entre size - 5; size nesse caso vale 27. O resultado é armazenado na variável 'x'.

if (x < 15) myDog.back(8); //se x (valor = 22) for menor que 15, executar myDog.bark(8), latir(back) 8 vezes.

while (x > 3) { //define uma laço de repetição, enquanto x for maior que 3 será executado determinada ação.
    myDog.play(); //myDog.play (cao brinca) será executado caso a condição da linha anterior seja atendida.
} //Esta chave fecha a condição while.

int [] numList = (2,4,6,8); //Declara uma lista de variáveis do tipo inteiro numList, insere 2,4,6,8;

System.out.print("Hello"); //exibe uma mensagem na tela, nessa caso: "Helhor"

System.out.print(" Dog: " + name); //exibe uma mensagem na tela, nesse caso, a String Dog + name, ficando: Dog: Fido.

String num = "8"; //declara uma variável do tipo string chamada num e lhe atribui o valor 8.

int z = Integer.parseInt(num); //converte a string de caractere (num = 8) no valor numerico real: 8.

try{
    readTheFile("MyFile.txt");
}
catch(FileFoundException ex) {
System.out.print("File not found.");
}
}
}
