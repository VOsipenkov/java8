package dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Note {
    private String objectId;
    private String updateDateTime;
    private String notation;
    private List<ObjectReference> objectReferences;
    private String dateTimeCalc;
    private String authorId;
    private String authorName;
}
