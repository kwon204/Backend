package hello.netronics.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CommentResponseDto {
    private Long commentId;
    private String content;
    private String author;
    private LocalDateTime createdAt;
    private List<CommentResponseDto> replies;  // 대댓글 리스트
}
