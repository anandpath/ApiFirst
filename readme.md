## For the Service to be in ECR
1. First build the docker image with: docker build -t apifirst .
2. Then try running, locally, the image as container [host_port]:[container_port]: docker run -d --publish 80:80 apifirst
3. Then connect using aws cli and docker login to ecr: aws ecr get-login-password --region <region-e.g.,ap-south-1> | docker login --username AWS --password-stdin <your_account>.dkr.ecr.<region-e.g.,ap-south-1>.amazonaws.com
   - Certainly run this command in Windows PowerShell. Refer following link for "failed with status: 400 Bad Request" issue: https://stackoverflow.com/questions/65576285/docker-login-on-ecr-fails-with-400-bad-request-on-powershell-from-jenkins 
4. Then tag the docker image: docker tag apifirst:latest <your_account>.dkr.ecr.<region>.amazonaws.com/<ecr-repository-name>:latest
5. Then push the image to ecr: docker push <your_account>.dkr.ecr.<region>.amazonaws.com/<ecr-repository-name>:latest
