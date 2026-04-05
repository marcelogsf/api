package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service  // "Esta classe é um Service do Spring!"
public class AlunoService {

    @Autowired  // Injeção de dependência automática!
    AlunoRepository alunoRepository;

    // CREATE — salvar novo aluno
    public void criarAluno(Aluno aluno) {
        alunoRepository.save(aluno);  // INSERT INTO aluno ...
    }

    // READ — listar todos
    public List<Aluno> listarTodosAlunos() {
        return alunoRepository.findAll();  // SELECT * FROM aluno
    }

    // READ — buscar por ID
    public Optional<Aluno> buscarAlunoPorId(Long id) {
        return alunoRepository.findById(id);  // SELECT * FROM aluno WHERE id = ?
    }

    public void deletarAlunoPorId(Long id){
        alunoRepository.deleteById(id);
    }

    // UPDATE — atualizar por ID
    public void atualizarAlunoPorId(Long id, Aluno alunoEditado) {
        alunoEditado.setId(id);
        alunoRepository.save(alunoEditado);
    }
}