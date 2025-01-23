import xml.etree.ElementTree as ET

def read_xml(file_path):
    with open(file_path, 'r') as file:
        lines = file.readlines()
    return lines

def compare_xml(file1_lines, file2_lines):
    differences = []
    max_lines = max(len(file1_lines), len(file2_lines))

    for i in range(max_lines):
        line1 = file1_lines[i] if i < len(file1_lines) else ''
        line2 = file2_lines[i] if i < len(file2_lines) else ''
        if line1 != line2:
            differences.append((i + 1, line1.strip(), line2.strip()))

    return differences

def main(file1_path, file2_path):
    file1_lines = read_xml(file1_path)
    file2_lines = read_xml(file2_path)
    differences = compare_xml(file1_lines, file2_lines)

    if differences:
        print("Unterschiede gefunden:")
        for line_num, line1, line2 in differences:
            print(f"Zeile {line_num}:")
            print(f"  Datei 1: {line1}")
            print(f"  Datei 2: {line2}")
            print("-" * 20)
    else:
        print("Keine Unterschiede gefunden.")

if __name__ == "__main__":
    file1_path = 'Workspace-Settings\\Spielwiese\\compareXMLFile\\file1.xml'
    file2_path = 'Workspace-Settings\\Spielwiese\\compareXMLFile\\file1.xml'
    main(file1_path, file2_path)
