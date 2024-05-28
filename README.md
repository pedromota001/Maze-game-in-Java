# Maze-game-in-Java
Maze game developed in Java
## ALUNOS : LUÍS GUSTAVO - 848988, RONDON GUILHERME - 850074, GUSTAVO PORTO - 848942, PEDRO MOTA - 849615, MIGUEL PROCÓPIO - 849029.

# Requisitos Mínimos:
- Definimos todas as classes básicas (Aventureiro, Perigos, Tesouros, Labirinto).
- Coleções utilizamos ArrayLists (exemplo: ArrayList<Tesouro> tesourosColetados) utilizado para armazenar todos os tesouros armazenados pelo labirinto.
- Na parte de tratamento de exceções utilizamos o try catch exception para verificar a existência de um arquivo e se ele abre dentro da classe Main.
- Polimorfismo // continuar
- Na abstração utilizamos a classe Perigo e Tesouro como abstratas, além de serem SuperClasses herdando suas carecteristicas para vários tipos de perigos e tesouros.
- Os conceitos de public e private estão presentes na classe (não tem muito o que falar).
# Requisitos Adicionais:
## Bibliotecas para utilização de GUI JAVA SWING:
- 'import javax.swing.JPanel' utilizado para a criação de um 'Panel' que seria onde funcionará todo o conceito do GUI.
- 'import javax.swing.JButton' utilizado para usar botões interativos com o usuário na interface.
- 'import javax.swing.JLabel' criações de caixas de texto para exibir a saída da lógica do labirinto.
- 'import javax.swing.*' importação do swing.
- 'import javax.swing.JOptionPane' utilizado em mensagens de alerta.
- 'import java.awt.event.ActionEvent' para atribuir ações aos botões.
- 'import java.awt.event.ActionListener' idem.
## Bibliotecas para criação de imagens
- 'import javax.imageio.ImageIO' - utilizado para ler a 'BufferedImage' e ser implementada na lógica do try catch.
- 'import java.io.File' - criação de arquivo para leitura.
- 'import java.awt.image.BufferedImage' - criação de um buffer para imagem.
- 'import java.io.IOException' - tratamento de exceção se a imagem abre ou não.
## GUI COM JAVA SWING:
- Criamos uma interface interativa com usuário onde existem botões interativos que em andam pelo labirinto (Matriz).
- Lógica de saída do labirinto implementada no GUI utilzando de caixa de mensagens não interativas.
- Alerta de Bem-vindo ao aventureiro e o input inicial do tamanho do labirinto.
- GAMEOVER com imagem, mensagem, e estatísticas (Pontos totais naquela gameplay, e moedas coletadas) implementadas.
## Classes Extras:
- Fogo, Buraco e Espinhos (Perigos implementados na lógica de perder vida).
- Moedas, Localizador e KitMédico (Tesouros implementados na lógica de conquistas pontos).

