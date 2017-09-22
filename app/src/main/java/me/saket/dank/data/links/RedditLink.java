package me.saket.dank.data.links;

/**
 * A reddit.com link.
 */
public abstract class RedditLink extends Link {

  @Override
  public Link.Type type() {
    return Link.Type.REDDIT_PAGE;
  }
}