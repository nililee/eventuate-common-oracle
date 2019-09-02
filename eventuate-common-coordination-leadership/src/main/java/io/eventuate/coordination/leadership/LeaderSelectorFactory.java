package io.eventuate.coordination.leadership;

public interface LeaderSelectorFactory {
  EventuateLeaderSelector create(String lockId,
                                 String leaderId,
                                 LeaderSelectedCallback leaderSelectedCallback,
                                 Runnable leaderRemovedCallback);
}
