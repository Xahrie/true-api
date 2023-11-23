package de.xahrie.trues.api.scouting.analyze;

import de.xahrie.trues.api.coverage.player.model.Player;
import de.xahrie.trues.api.coverage.player.model.Rank;

public record PlayerRankChange(Player player, Rank oldRank, Rank newRank) {
  public int isPromoted() {
    if (oldRank == null)
      return newRank == null ? 0 : 1;
    else if (newRank == null)
      return -1;
    return oldRank.compareTo(newRank);
  }
}
