Ext.define('Ext.form.ComboBox', {
    fieldLabel: '',//在实例化的时候设置
    store: typeComboStore,
    queryMode: 'local',
    displayField: 'typeName',
    valueField: 'tpyeId',
     
});

Ext.define('Ext.data.Store', {
    fields: ['tpyeId', 'typeName'],
    proxy:{
    	type:'ajax',
    	url:''
    }
});