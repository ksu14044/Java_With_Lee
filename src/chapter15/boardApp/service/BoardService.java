package chapter15.boardApp.service;

import chapter15.boardApp.dto.BoardRequestDto;
import chapter15.boardApp.dto.BoardResponseDto;
import chapter15.boardApp.entity.Board;

import java.util.List;

public interface BoardService {
    List<BoardResponseDto> findAll();
    BoardResponseDto findById(Long id);
    void save(BoardRequestDto boardRequestDto);
    void update(long id, BoardRequestDto boardRequestDto);
    void delete(long id);
}    
