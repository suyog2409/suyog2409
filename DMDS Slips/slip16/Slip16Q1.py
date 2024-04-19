#import lattice
library(lattice)
# create data
gfg<-data.frame(x=c(26,35,32,40,35,50),
     grp=rep(c("group 1","group 2","group 3"),
        each 2),
    subgroup=LETTERS[1:2])
# create grouped barplot using lattice
barchart(x~grp,data=gfg,groups=subgroup)
