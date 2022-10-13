aws ssm put-parameter --name /product-management-service/dev/database/pg/hostname --value 'add aws host url here' --type String --region us-west-2 --data-type text --profile aws-personal
aws ssm put-parameter --name /product-management-service/dev/database/pg/port --value '5432' --type String --region us-west-2 --data-type text --profile aws-personal
aws ssm put-parameter --name /product-management-service/dev/database/pg/database --value 'productdb' --type String --region us-west-2 --data-type text --profile aws-personal
aws ssm put-parameter --name /product-management-service/dev/database/pg/username --value 'postgres' --type String --region us-west-2 --data-type text --profile aws-personal
aws ssm put-parameter --name /product-management-service/dev/database/pg/password --value 'add db password' --type String --region us-west-2 --data-type text --profile aws-personal
aws ssm put-parameter --name /product-management-service/dev/database/pg/schema --value 'public' --type String --region us-west-2 --data-type text --profile aws-personal

#run these in console to add environment variables to the aws 
#onece it is added you dont need to run these commands again and again since it is already stored in aws