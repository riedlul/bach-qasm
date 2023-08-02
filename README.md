# bach-qasm
Repo Bachelorthesis Matthäus Riedler
This
(last updated 2.8.2023)
(all work was done on Windows PC, not tested for Linux or MacOS)

-----Prerequesites-----
Java (https://www.java.com/de/download/manual.jsp)
Python (https://www.python.org/downloads/) *qiskit requires python 3.6 or higher*
Eclipse (https://www.eclipse.org/downloads/)

-----pip install-----
pip install qiskit
pip install matplotlib

-----Install in Eclipse-----
PyDev (https://www.pydev.org/manual_101_install.html)
Xtext (https://eclipse.dev/Xtext/download.html)

-----Config-----
in qasmDraw project:
    src/qasmDraw/QasmDraw.xtext, right click -> Run As -> Generate Xtext Artefacts
on qasmDraw, right click -> Run As -> Eclipse Application
in runtime-application project:
    +on qasmDraw Project -> Properties:
      -Builders: make Sure drawQiskit Builder is active:
        --Edit Builder: make sure Location is correct and points to run_script.bat
    +in qiskitPy.py: change location of .qasm file 
    +in run_scipt.bat: change location of python script
    
-----Workflow-----
