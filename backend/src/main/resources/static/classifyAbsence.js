function classifyAbsence(data, setData, setLoading) {
  let info = [""];
  const counts = {};
  const structuredData = [{}];
  info = data.map((item, index) => {
    return item.absenceType.name;
  });
  info.forEach(function (x) {
    counts[x] = (counts[x] || 0) + 1;
  });
  for (var key in counts) {
    if (counts.hasOwnProperty(key)) {
      structuredData.push({ arg: key, val: counts[key] });
    }
  }
  setData(structuredData);
  setLoading(false);
}
