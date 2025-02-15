package pl.patrykchmiel.demo.oauth2.application.client.github.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GithubRepository {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("private")
    private boolean isPrivate;
    @JsonProperty("owner")
    private GithubUser owner;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("description")
    private String description;
    @JsonProperty("fork")
    private boolean fork;
    @JsonProperty("url")
    private String url;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("pushed_at")
    private String pushedAt;
    @JsonProperty("git_url")
    private String gitUrl;
    @JsonProperty("ssh_url")
    private String sshUrl;
    @JsonProperty("clone_url")
    private String cloneUrl;
    @JsonProperty("svn_url")
    private String svnUrl;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("stargazers_count")
    private Integer stargazersCount;
    @JsonProperty("watchers_count")
    private Integer watchersCount;
    @JsonProperty("language")
    private String language;
    @JsonProperty("has_issues")
    private boolean hasIssues;
    @JsonProperty("has_projects")
    private boolean hasProjects;
    @JsonProperty("has_downloads")
    private boolean hasDownloads;
    @JsonProperty("has_wiki")
    private boolean hasWiki;
    @JsonProperty("has_pages")
    private boolean hasPages;
    @JsonProperty("has_discussions")
    private boolean hasDiscussions;
    @JsonProperty("forks_count")
    private Integer forksCount;
    @JsonProperty("archived")
    private boolean archived;
    @JsonProperty("disabled")
    private boolean disabled;
    @JsonProperty("open_issues_count")
    private Integer openIssuesCount;
    @JsonProperty("allow_forking")
    private boolean allowForking;
    @JsonProperty("is_template")
    private boolean isTemplate;
    @JsonProperty("web_commit_signoff_required")
    private boolean webCommitSignoffRequired;
    @JsonProperty("topics")
    private List<String> topics;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("forks")
    private Integer forks;
    @JsonProperty("open_issues")
    private Integer openIssues;
    @JsonProperty("watchers")
    private Integer watchers;
    @JsonProperty("default_branch")
    private String defaultBranch;
}
