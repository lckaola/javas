# javas

# git 常用命令



## 1 多人协作



知识了解：

从远程仓库克隆时，实际上Git自动把本地的master分支和远程的master分支对应起来了，并且，远程仓库的默认名称是origin

查看远程库的信息：

 $ git remote

origin

用git remote -v显示更详细的信息



推送分支命令：

推送分支，就是把该分支上的所有本地提交推送到远程库。推送时，要指定本地分支，这样，Git就会把该分支推送到远程库对应的远程分支上：

$ git push origin master   #将本地的当前分支推送到远程的origin的master分支上

$ git push origin dev   #将本地的当前分支的内容推送到远程的origin的dev分支上





### 2 多人同时推送操作方法



A克隆分支到本地：

 $ git clone git@github.com:michaelliao/learngit.git  

$ git branch   #只能看到master分支

\* master



A要在dev分支上开发，就必须创建远程origin的dev分支到本地:

$ git checkout -b dev origin/dev    #创建远程的origin的dev分支到本地



在dev上继续修改，然后，时不时地把dev分支push到远程：

$ git add env.txt

$ git commit -m "add env"

$ git push origin dev   #推送到远程的origin的dev分支上



B: 自己也在dev上作修改，也推送到dev的分支上：

$ cat env.txt

env

$ git add env.txt

$ git commit -m "add new env"



$ git push origin dev  #同样推送到远程的origin的dev分支上



$$ git pull   #git pull失败了，原因是没有指定本地dev分支与远程origin/dev分支的链接，根据提示，设置dev和origin/dev的链接



$ git branch --set-upstream-to=origin/dev dev

Branch 'dev' set up to track remote branch 'dev' from 'origin'.



再git pull:

$ git pull  



git pull成功，但是合并有冲突，需要手动解决，解决的方法和分支管理中的解决冲突完全一样。解决后，提交，再push



$ git commit -m "fix env conflict"  #在本地先把冲突解决了，再推送到远程去

$ git push origin dev  #把本地已经解决的冲突的代码再次提交到远程的dev

