#for 3d 
#library(plotrix)
Dice_digits<-c(1,2,3,4,5,6)
freq_of_num<-c(7,2,6,3,4,8)
pct=round(Dice_digits/sum(Dice_digits)*100)
pct
new_labels=paste(Dice_digits,"-",pct,"%",sep="")
new_labels
pie_(Dice_digits,labels=new_labels,main="Frequency of getting number on dice",col=rainbow(6))
#pie3D(Dice_digits,labels=new_labels,main="Frequency of getting number on dice",col=rainbow(6),ex plode=0.0)
