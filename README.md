## Topicos Abordados
- Java Foudation Class
  - Swing API
    - Containers
      - Eles podem conter vários componentes, exemplo (JFrame é um container)
    - Componentes
    - LayoutManagers
    - Trabalhando com Menus
    - Tratamento de Eventos Look & feel
### Java Foundation Classes
- Conhecida como JFC é um conjunto de APIs java padrão do lado do cliente, interfaces gráficas de usuário (GUIs) e tarefas de programação relacionadas. Eles são classes básicas no sentido de que a mairia dos aplicativos Java do lado do cliente são construidos sobre essas APIs. Este livro abrage as seguites APIs:
  - AWT: Embora os recursos mais poderosos e interessantes do JFC tenham sido introduzidos na versão 1.2 da plataforma java 2, o JFC também inclui os recursos gráficos e de GUI do Java 1.0 e do Java 1.1. Esses recursos são oferecidos pelo Abstract Windowing Toolkit (AWT). 0s recursos gráficos e de GUI do AWT são rudimentares e muitos deles foram substituídos por recursos mais avançados do java 1.2. No entanto, o AWT é a base sobre a qual a funcionalidade do JFC mais avançada é construida.
  Além disso, há certas situações em que você não pode tirar proveito da nova funcionalidade JFC e deve confiar apenas no AWT. Por cauda disso, as APIs gráficas e GUI do AWT são discutidas juntos com as APIs mais poderosas introduzidas no java 1.2.
- É um conjunto de funcionalidades que proporciona a criação 

### Balanço
- Swing é um kit de ferramentas GUI avançado escrito em java puro. Isso é construido sobre o AWT, mas forneve muitos novos componentes de GUI e serviços de aplicativos úteis relacionados à GUI. O Swing oferece uma arquitetura de aparência conectável que permite que um aplicativo seja configurado trivialmente para exibir uma aparência e comportamento Java independente de plataforma ou para imitar a aparência do sistema operacional de tela ou ompliadores de tela para deficientes visuais. Muitos recursosdo Swing são baseados no projeto pioneiro do NetScape Internet Foudation Classe.
- Swing é uma parte essencial da plataforma Java 2. No entanto está disponível como um extensão do Java.

### Java 2D
- Java 2D é o nome da API de gráficos bidimencionais de última geração introduzida no Java 1.2. O Java 2D é construido sobre o AWT, mas expande bastante os recursos gráficos que estavam disponíveis no java 1.0 e Java 1.1. Java 2D inclui suporte para independência de resolução, rotação, dimencionamento e cisalhamento de gráficos arbitrários, suavização de texto e gráficos, transparência alfa, composição de cores e o uso de toda a gama de fontes instaladas no sistema nativo.

### Transferencia de dados
- Um recurso importante de muitos aplicativos do lado do cliente é a capacidade de permitir a transferência de dados direcionada ao usuário dentro do aplicativo e entre aplicativo e entre aplicativos não relacionados. Existem duas metáforas de transferência de dados comumente usadas: recortar e colar e arrastar e soltar. Java 1.1 definiu uma estrutura básica de transferência de dados e forneceu uma API para recortar e colar. Java 1.2 adiciona suporte para transferência de dados usando a metáfora de arrastar e soltar.

### Miniaplicativos
- A API do Applet permite que um programa do lado do cliente seja executado como um applet, ou mini-aplicativo, em um navegador da Web ou alguma outra forma de visualizador de applet. Tecnicamente, a API do applet não faz parte do JFC, mas é uma parte crucial do quadro de programação Java do lado do cliente.

### Swing
- É um novo kit de ferramentas de GUI que está disponível como parte principal da plataforma Java 2 e também como um extensão do Java 1.1. Swing é uma extesão do kit de ferramentas AWT, não um kit de ferramentas totalmente novo. Todos os componentes GUI fornecidos pelo Swing não componentes leves, portanto, não dependem das GUIs nativas subjacetes. O resultado é que o swing é mais portável, tornando mais fácil escrever aplicativos gráficos que se comportavam da mesma forma em todas as plataformas. O Swing também é maior e mais abrangente que o AWT. Além de um conjunto completo e poderoso de componentes GUI, o Swing fornece vários utilitários que facilitam a escrita de aplicativos gráficos. 
- O Swing oferece um grade avaço quando comparado ao AWT. Você deve usar o Swing em todos os seus aplicativos Java 2. Você também deve considerar seriamente usá-lo como uma extensão para aplicativos Java 1.1.