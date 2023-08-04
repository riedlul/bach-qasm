# bach-qasm
Repo Bachelorthesis Matthäus Riedler
(last updated 2.8.2023)
(all work was done on Windows PC, not tested for Linux or MacOS)

-----Prerequesites-----
Java (https://www.java.com/de/download/manual.jsp)
Python (https://www.python.org/downloads/) *qiskit requires python 3.6 or higher*
Eclipse (https://www.eclipse.org/downloads/)

-----pip install-----
pip install qiskit
pip install matplotlib
pip install pylatexenc

-----Install in Eclipse-----
PyDev (https://www.pydev.org/manual_101_install.html) (Install via Eclipse marketplace) +++++++++++++++
Xtext (https://eclipse.dev/Xtext/download.html) (Install via add new software)
LSP4J (https://projects.eclipse.org/projects/technology.lsp4j) (Install via add new software)

-----Config-----
Create new Xtext Project (https://eclipse.dev/Xtext/documentation/102_domainmodelwalkthrough.html)
    +Project Name: qasmDraw
    +Language Name: qasmDraw.QasmDraw
    +Extension Name: qasm
on qasmDraw project, right click -> Properties -> Run/Debug Settings -> Eclipse Application -> Edit -> Configuration Tab -> Enable Support software installation in the launched application
in qasmDraw project:
    +src/qasmDraw/QasmDraw.xtext, right click -> Run As -> Generate Xtext Artefacts
on qasmDraw, right click -> Run As -> Eclipse Application
in runtime-application:
    +Import runtime-app\qasmDraw into workspace
    +on qasmDraw Project -> Right Click -> Properties:
      -PyDev Interpreter, select interpreter python.exe
      -Builders: make Sure drawQiskit Builder is active:
        --Edit Builder: make sure Location is correct and points to run_script.bat
    +in qiskitPy.py: change location of .qasm file
    +in run_scipt.bat: change location of python script
    +in PythonScriptRunner: change location of scriptPath
    
-----Workflow-----
Start Eclipse
on qasmDraw, right click -> Run As -> Eclipse Application
in runtime-application:
    +Change your .qasm to desired OpenQASM syntax
    +Hit Save on .qasm File
    +Builder should activate .bat File
    +.bat File should run PythonScriptRunner
    +PythonScriptRunner should run qiskitPy.py
    +qiskitPy should save qc.png locally in same package as these Scripts
    +Drag qc.png into view, both .qasm code and qc.png should be visible in the same window
    +Builder should automatically refresh qc.png after each build