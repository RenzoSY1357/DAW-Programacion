PATH: /Documents/Programming/GIT\ UDEMY/

**TO LOGIN:**
git config --global user.email " *** " :
git config --global user.name " *** ":
--> Sets your email/user address globally across all repositories on your machine.
# This email/user will appear in your commits metadata, to make it easier to track who made each change.
(to reset the username and the name, just repeat the commands)
# To login for a specific repository just get rid of the (--global)

**TO CREATE REPOSITORY**
git init : Creates an empty Git repository in the current directory, enabling Git tracking.
git remote add origin "repository_url" : Links the local repository to your remote one.
git remote -v: displays a list of the remote repositories associated with your local Git repository.
# Shows the URL git will use for Pulling(Fetch) and Pushing.

**(REMOTE) REPOSITORY**
git clone "Url": Copies a repository from a remote server to the local machine.
git push : UPLOAD your local commits (local updates) to your remote repository
git pull : DOWNLOAD (remote updates) into your local repository
git branch "Name of branch" : Creates a new branch (A parallel version of the project)

**CREATE FILES OR DIRECTORIES (LOCAL)**
touch " ***.* " : Create a file .(type of file)
touch " *** ".gitignore : Create a file or directory that you want to ignore (You can name it if you want)

#  Inside the file name, you must write the names of the files that you want git not to track

        Example: Hola.txt, Imagen.jpg, you can write commentaries with a "#", it means that comments wont be read by the file
            - writing, "directoryName" + " /* ", will ignore everything inside the directory.

        Also, You can write "#" in gitignore to write commentaries
# --------------------------------------------------------------------------------------
mkdir " *** " : create a directory
rm " ***.* ": remove a file
rm -r " *** " remove a directory and its content

**DELETION COMMANDS**
git rm " *** " : remove a file from your local but not repository
git rm -cached " *** " : remove a file from repository, but not from your local.
git rm -f " *** " : "f" stands for "force", confirm the removed file to your repository
# "f" : Also, forces the deletion of files and directories without prompting for confirmation, ("-rm" removes everything).
git rm -r + --cached: "r" stands for "recursive", which means it will apply to all files and directories within a specific path.

**COMMIT COMMANDS**
git add : Add a especific file to the staging area.
git add . : Add changes to the staging area
git commit -m " *** " : Create a commit (You must write the "" if you want the commment with spaces.)
git log : shows commits made, who made them, and when
# The strange numbers next to the word "commit", are the commit "address path"
git log --oneline : Show you the commits in a tidier order.
# The Strange numbers at the left are its address path of the commits (summarized)

**GIT CHECKOUT**
git checkout : THIS, has multiple functionalities
    git checkout "Strange numbers that appear, next to the word of the commits of commit log" : Move to the commit
    git checkout "branch name" : Move to the branch
    git checkout "master" : Move to the lastest commit, or the "main".

**REVERT COMMANDS**
git revert "Strange numbers": To Revert a commit (Creates a commit that undoes changes made by another commit)

**TO RESET MULTIPLE COMMITS**
git reset --hard "Strange numbers"
# This ACTUALLY goes you back in time, the git reset, only resets you specific commits, it can cause alterations in the program, BUT THIS, as it reverts a bunch of commits, it directs you back to another workstage.

**BRANCHES**
git branch "Name" : Create a branch, but doesnt switchs to it
git checkout -b "Name" : This doesnt only creates a branch, but you switch to it too.
git branch -a : Lists all of the branches, that we have created.
git branch -r: Lists all of the branches, that we have created in the remote repository.

git fetch -p: Prune (remove) any branches from your local repository that no longer     exist on the remote.
(If still, the branches appear on the repository,
write "git remote prune origin" )

     fetch: Buscar
     prune = Clean up stale remote branch references.

//Doesn´t delete actual branches, just the reference to branches that no longer exist remotely.


(Safe) git branch -d "Name" : Delete a branch from local repository / warns you if it has unmerged changes.
(Unsafe) git branch -D "Name": Deletes a branch, without checking if it has merged changes.

**MERGING BRANCHES**
git merge "Name of Branch": Combines changes from one branch into another.
# When merging the branches git creates a new commit that records the merge and includes both sets of changes of the branches merged. However, if the branches doesnt have any commits, git just "go forward", creating only one branch without making any commits.

# Remember merging, only takes the last commit of the source branch.

**GITHUB**
Option fork in github interface from publics repositories: CLones the repository and puts it on your github repositories.
# If  you want to clone a repository, use the "clone" option, dont donwload it by file, because it just donwload --> The files, do not clone the repository

-- Fetch / Pulling: Takes a branch from a repository and fits it into your already existing repository.

git remote add origin "Link of repository": To connect my local repository to my remote.
git remote -v: To confirm that the my local repository is connected to the remote.

git pull origin master: This is the first pull, where you have to track the MAIN branch, with "origin"
git pull "Branch": Takes a branch from a repository and fits it into your already existing repository.
# just: git pull: only if there is just one branch
git push "Name of the branch": Push the commited changes to the remote repository.
git push "-u" + "Name of the branch"-->(just once): The "-u" is an indication to remember the branch name, when making following pushes
git push origin --delete "Name of branch":

git rebase: Combines everything and starts from there.

# Example:

    Git merge:
        A -- B -- C ------ (M) Merged commit
                \        /
                 D ---- E

    Git rebase:
    A -- B -- C ---------
                \        
                 D ---- E

    --> A -- B -- C -- D' -- E'(Rebased)


-- origin: the default name for the remote repository you cloned from. // it refers to the main remote repository.
-- master /or/ main: the name of the branch, in this case the branch MAIN branch.
