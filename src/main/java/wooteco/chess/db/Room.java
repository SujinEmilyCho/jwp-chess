package wooteco.chess.db;

import org.springframework.data.annotation.Id;

import java.util.HashSet;
import java.util.Set;

public class Room {
    @Id
    private Long id;
    private String name;
    private Set<ChessPiece> chessPieces = new HashSet<>();
    private Set<MoveHistory> moveHistorys = new HashSet<>();

    public Room() {
    }

    public Room(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ChessPiece> getChessPieces() {
        return chessPieces;
    }

    public void addChessPieces(Set<ChessPiece> chessPieces) {
        this.chessPieces.addAll(chessPieces);
    }

    public Set<MoveHistory> getMoveHistorys() {
        return moveHistorys;
    }

    public void addMoveHistory(MoveHistory moveHistory) {
        this.moveHistorys.add(moveHistory);
    }
}
