<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
  </head>
  <body>
    <h1>Classe UploadFilesController</h1>
    <p>Esta classe é responsável por receber e salvar arquivos enviados através de uma API REST.</p>
    <h2>Anotações</h2>
    <ul>
      <li><code>@RestController</code> - Anotação que indica que a classe é um controlador REST.</li>
      <li><code>@RequestMapping("api/upload")</code> - Anotação que indica o caminho base para as requisições deste controlador.</li>
      <li><code>@Slf4j</code> - Anotação que adiciona o log de registros à classe.</li>
      <li><code>@RequiredArgsConstructor</code> - Anotação do Lombok que gera um construtor com todos os campos que são final ou marcados com a anotação <code>@NonNull</code>.</li>
    </ul>
    <h2>Atributos</h2>
    <ul>
      <li><code>uploadFilesService</code> - Objeto da classe <code>UploadFilesServiceImpl</code> que é responsável pelo processamento dos arquivos enviados.</li>
    </ul>
    <h2>Métodos</h2>
    <h3>saveFile</h3>
    <p>Método responsável por receber um arquivo enviado através de uma requisição HTTP POST e salvá-lo no servidor.</p>
    <p><strong>Parâmetros:</strong></p>
    <ul>
      <li><code>file</code> - Objeto da classe <code>MultipartFile</code> que contém o arquivo a ser salvo.</li>
    </ul>
    <p><strong>Retorno:</strong></p>
    <ul>
      <li>Um objeto da classe <code>ResponseEntity</code> contendo uma mensagem de sucesso ou erro, e o código de status HTTP.</li>
    </ul>
    <hr>
  </body>
</html>
