package hudson.plugins.git;

import hudson.model.AbstractBuild;
import hudson.scm.SCMRevisionState;
import org.spearce.jgit.lib.ObjectId;
import java.io.Serializable;

/**
 * Action contributed to {@link AbstractBuild} from Git plugin
 */
public class GitRevisionState extends SCMRevisionState implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * SHA-1
     */
    public final ObjectId rev;

    public GitRevisionState(ObjectId rev) {
        this.rev = rev;
    }

    public @Override String toString() {
        return "GitRevisionState:" + rev.toString();
    }

}
