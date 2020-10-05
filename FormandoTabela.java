public class FormandoTabela {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Tabela temp = new Tabela();

			
		//dados da tabela, em números inteiros
		
		while (temp.opcao == 0) {
			System.out.print("Digite a opção baixo: \n");
			System.out.print("Digite o número de pontos do jogo (1) \n");
			System.out.print("Conferir a tabela                 (2) \n");
			System.out.print("Sair                              (3)\n\r");
			temp.opcao = scan.nextByte();
			switch (temp.opcao) {
						
					case 1:
					System.out.print("Placar do Jogo: \r");
					temp.ponto = scan.nextInt();
					if (temp.ponto >= 0 && temp.ponto < 1000) {
						temp.pontos.add(temp.ponto);
						temp.jogos.add(temp.jogo + 1);
						temp.jogo += 1;
						
						if (temp.pontoMax > temp.ponto) {
							temp.pontoMax = temp.ponto;
							temp.recMax.add(temp.indiceMax);
						}
						
						if (temp.pontoMin < temp.ponto) {
							temp.pontoMin = temp.ponto;
							temp.recMin.add(temp.indiceMin);
						}
						
						temp.indiceMax += 1;
						if (temp.recMin.size() > 0) {
							temp.indiceMin += 1;
						}
						
						
						
							temp.tabela.add("\n     Jogo    "
						
								+ "|      Placar     "
								+ "|     Min. da Temporada       "
								+ "|     Máx. da Temporada        "
								+ "|     Quebra de Rec. Min.       "
								+ "|     Quebra de Rec. Max.");
						
						
						
					
						temp.tabela.add("       " + temp.jogos.get(temp.index) + "     "
								+ "        " + temp.pontos.get(temp.index) + "       "
								+ "            "+ temp.pontoMax + "                "
								+ "            "  + temp.pontoMin +"               "
								+ "              " + (temp.recMax.size() - 1)+"               "
								+ "               " + (temp.recMin.size() - 1));	
						temp.index += 1;
						temp.opcao = 0;
						break;}

					case 2:
						for (int i = 0; i < temp.tabela.size(); i++) {
							System.out.println(temp.tabela.get(i));
						}
						temp.opcao = 0;
						break;
					case 3:
						System.out.println("Finalizando o programa...");
						break;
					default:
						System.out.println("Opcão inválida!");
						temp.opcao = 0;
						break;

					}
				}
				scan.close();


 }
}
