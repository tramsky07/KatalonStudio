@echo off
echo running scripts on DEV
@echo Started: %date%
time /t

d:
cd D:\NewMan\MasterData

call newman run MasterData.postman_collection.json -k -e JAL_Dev_Environment_MasterData.postman_environment.json -g JalPortal.postman_globals.json -r html --reporter-html-export D:\NewMan\MasterData\Reports\POR-212_%date:~10,4%%date:~7,2%%date:~4,2%.html --folder POR-212 --export-environment D:\NewMan\MasterData\JAL_Dev_Environment_MasterData.postman_environment.json --export-globals D:\NewMan\MasterData\JalPortal.postman_globals.json

call newman run MasterData.postman_collection.json -k -e JAL_Dev_Environment_MasterData.postman_environment.json -g JalPortal.postman_globals.json -r html --reporter-html-export D:\NewMan\MasterData\Reports\POR-252_%date:~10,4%%date:~7,2%%date:~4,2%.html --folder POR-252 --export-environment D:\NewMan\MasterData\JAL_Dev_Environment_MasterData.postman_environment.json --export-globals D:\NewMan\MasterData\JalPortal.postman_globals.json

call newman run MasterData.postman_collection.json -k -e JAL_Dev_Environment_MasterData.postman_environment.json -g JalPortal.postman_globals.json -r html --reporter-html-export D:\NewMan\MasterData\Reports\POR-373_%date:~10,4%%date:~7,2%%date:~4,2%.html --folder POR-373 --export-environment D:\NewMan\MasterData\JAL_Dev_Environment_MasterData.postman_environment.json --export-globals D:\NewMan\MasterData\JalPortal.postman_globals.json

call newman run MasterData.postman_collection.json -k -e JAL_Dev_Environment_MasterData.postman_environment.json -g JalPortal.postman_globals.json -r html --reporter-html-export D:\NewMan\MasterData\Reports\POR-1075_%date:~10,4%%date:~7,2%%date:~4,2%.html --folder POR-1075 --export-environment D:\NewMan\MasterData\JAL_Dev_Environment_MasterData.postman_environment.json --export-globals D:\NewMan\MasterData\JalPortal.postman_globals.json

call newman run MasterData.postman_collection.json -k -e JAL_Dev_Environment_MasterData.postman_environment.json -g JalPortal.postman_globals.json -r html --reporter-html-export D:\NewMan\MasterData\Reports\POR-1420_%date:~10,4%%date:~7,2%%date:~4,2%.html --folder POR-1420 --export-environment D:\NewMan\MasterData\JAL_Dev_Environment_MasterData.postman_environment.json --export-globals D:\NewMan\MasterData\JalPortal.postman_globals.json

call newman run MasterData.postman_collection.json -k -e JAL_Dev_Environment_MasterData.postman_environment.json -g JalPortal.postman_globals.json -r html --reporter-html-export D:\NewMan\MasterData\Reports\POR-1520_%date:~10,4%%date:~7,2%%date:~4,2%.html --folder POR-1520 --export-environment D:\NewMan\MasterData\JAL_Dev_Environment_MasterData.postman_environment.json --export-globals D:\NewMan\MasterData\JalPortal.postman_globals.json

call newman run MasterData.postman_collection.json -k -e JAL_Dev_Environment_MasterData.postman_environment.json -g JalPortal.postman_globals.json -r html --reporter-html-export D:\NewMan\MasterData\Reports\POR-1889_%date:~10,4%%date:~7,2%%date:~4,2%.html --folder POR-1889 --export-environment D:\NewMan\MasterData\JAL_Dev_Environment_MasterData.postman_environment.json --export-globals D:\NewMan\MasterData\JalPortal.postman_globals.json

@echo Completed: %date%
time /t
pause